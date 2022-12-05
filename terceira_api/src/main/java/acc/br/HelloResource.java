package acc.br;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ola")
public class HelloResource {

    @Inject
    SegundaCDI segundaCDI;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return segundaCDI.getSecond();
    }
    
}