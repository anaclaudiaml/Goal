package controllers;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;
import play.db.jpa.*;
import views.html.*;
import models.*;


public class Application extends Controller {
    
    public static Result GO_HOME = redirect(routes.Application.list(0, "name", "asc", ""));
    
    public static Result index() {
        return GO_HOME;
    }
   
    
	/**
    Action to render the editForm
     */
    @Transactional(readOnly=true)
    public static Result edit(Long id) {
        Form<Posicoes> posicoesForm = form(Posicoes.class).fill(Posicoes.findById(id));
        return ok(editForm.render(id, posicoesForm));
    }
    
	/**
    Action to update the position
     */
    @Transactional
    public static Result update(Long id) {
        Form<Posicoes> posicoesForm = form(Posicoes.class).bindFromRequest();
        if(posicoesForm.hasErrors()) {
            return badRequest(editForm.render(id, posicoesForm));
        }
        posicoesForm.get().update(id);
        flash("success", "posicoes " + posicoesForm.get().name + " atualizadas");
        return GO_HOME;
    }
    
	/**
    Action to render the createForm
     */
	@Transactional(readOnly=true)
    public static Result create() {
        Form<Jogador> jogadorForm = form(Jogador.class);
        return ok(createForm.render(jogadorForm));
    }
    
    /**
    Action to save a new Jogador
     */
    @Transactional
    public static Result save() {
        Form<Jogador> jogadorForm = form(Jogador.class).bindFromRequest();
        if(jogadorForm.hasErrors()) {
            return badRequest(createForm.render(jogadorForm));
        }
        jogadorForm.get().save();
        flash("success", "posicoes " + jogadorForm.get().name + " criadas");
        return GO_HOME;
    }
    
    /**
    Action to delete a position
     */
    @Transactional
    public static Result delete(Long id) {
        Posicoes.findById(id).delete();
        flash("success", "Jogador Excluído");
        return GO_HOME;
    }
	
	@Transactional(readOnly=true)
    public static Result list(int page, String sortBy, String order, String filter) {
        return ok(list.render(Posicoes.page(page, 10, sortBy, order, filter),sortBy, order, filter));
    }

}
            
