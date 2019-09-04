package org.devbage.core.resource;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.devbage.core.model.Pessoa;
import org.devbage.core.service.PessoaService;

@Path("/ola")
public class OlaMundoResource {


    @Inject
    PessoaService pessoalSerive;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }


    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response create() {
        //vamos fazer assim somente para exemplificar um insert
        //depois vamos receber via request algumas informacoes
        //alem de melhorar nosso response
        Pessoa pessoa = new Pessoa("Rodrigo Freitas");
        pessoalSerive.persist(pessoa);
        return Response.ok(pessoa).build();
    }
}