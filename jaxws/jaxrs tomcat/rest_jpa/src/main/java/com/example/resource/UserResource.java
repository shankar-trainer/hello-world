package com.example.resource;

import com.example.model.User;
import jakarta.persistence.*;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;


@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("UserPU");

    @GET
    public List<User> getAll() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    @POST
    public User create(User user) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        return user;
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        User user = em.find(User.class, id);
        if (user != null) em.remove(user);
        em.getTransaction().commit();
    }
}
