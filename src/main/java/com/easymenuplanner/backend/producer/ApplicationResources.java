package com.easymenuplanner.backend.producer;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author oscar
 */
@ApplicationScoped
public class ApplicationResources {
    @Produces
    @PersistenceContext(unitName = "kepongoPU")
    private EntityManager em;
}