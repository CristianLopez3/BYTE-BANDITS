package com.sena.senasoft.domain.resource;

import java.util.List;

public interface IResourceService {
    Resource saveResource (ResourceDto resourceDto);
    List<Resource> getResourceList();
    Resource getResource(Long id);
    Resource updateResource(Long id, ResourceDto resourceDto);
    void deleteResource(Long id);
    List<Resource> findResourceByUser(Long id);
}
