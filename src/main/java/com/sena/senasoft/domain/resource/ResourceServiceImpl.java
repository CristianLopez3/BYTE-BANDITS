package com.sena.senasoft.domain.resource;

import com.sena.senasoft.domain.user.User;
import com.sena.senasoft.domain.user.UserServiceImpl;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ResourceServiceImpl implements IResourceService {

    /**
     * Dependency injection
     */
    private final ResourceRepository resourceRepository;
    private final UserServiceImpl userService;
    @Override
    public Resource saveResource(ResourceDto resourceDto) {
        User user = userService.getUser(resourceDto.user());
        Resource resource = new Resource();
        resource.setDescription(resourceDto.description());
        resource.setUser(user);
        resource.setUrl(resourceDto.url());
        return resourceRepository.save(resource);
    }

    @Override
    public List<Resource> getResourceList() {
        return null;
    }

    @Override
    public Resource getResource(Long id) {
        Optional<Resource> resource = resourceRepository.findById(id);
        if (resource.isEmpty()){
            throw new EntityNotFoundException("Resource not found");
        }
        return resource.get();
    }

    @Override
    public Resource updateResource(Long id, ResourceDto resourceDto) {
        Optional<Resource> resource = resourceRepository.findById(id);
        if (resource.isEmpty()){
            throw new EntityNotFoundException("Form not found");
        }
        Resource realResource = resource.get();
        realResource.setDescription(resourceDto.description());
        realResource.setUrl(resourceDto.url());
        return resourceRepository.save(realResource);
    }

    @Override
    public void deleteResource(Long id) {
        Optional<Resource> resource = resourceRepository.findById(id);
        if (resource.isEmpty()){
            throw new EntityNotFoundException("Form not found");
        }
        resourceRepository.delete(resource.get());
    }
    /**
     * @param id
     * @return list of choices for a given question
     */
    @Override
    public List<Resource> findResourceByUser(Long id) {
        return resourceRepository.findByUserId(id);
    }
}
