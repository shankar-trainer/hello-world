package abc.com.model;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/books")
@Stateless
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BookResource {

    @PersistenceContext(unitName = "MyPU")
    private EntityManager em;

//    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory
//            ("my-resource-local-pu");
//    EntityManager em = emf.createEntityManager();

    @GET
    public List<Book> getAll() {
        return em.createQuery("SELECT b FROM Book b", Book.class).getResultList();
    }

    @POST
    public Response create(Book book) {
        em.persist(book);
        return Response.status(Response.Status.CREATED).entity(book).build();
    }

    @GET
    @Path("/{id}")
    public Book getOne(@PathParam("id") Long id) {
        return em.find(Book.class, id);
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, Book book) {
        Book existing = em.find(Book.class, id);
        if (existing == null) return Response.status(Response.Status.NOT_FOUND).build();
        
        existing.setTitle(book.getTitle());
        existing.setAuthor(book.getAuthor());
        em.merge(existing);
        return Response.ok(existing).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id) {
        Book book = em.find(Book.class, id);
        if (book != null) em.remove(book);
        return Response.noContent().build();
    }
}