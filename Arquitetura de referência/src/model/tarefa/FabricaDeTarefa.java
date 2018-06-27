package model.tarefa;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class FabricaDeTarefa {

	static Map<String, Tarefa> tarefas = new HashMap<String, Tarefa>();
	static {
		tarefas.put("POST/login", new LoginTarefa());
		tarefas.put("GET/logout", new LogoutTarefa());
		tarefas.put("GET/exibeFormCadastroUsuario", new exibeFormCadastroUsuarioTarefa());
		tarefas.put("POST/cadastrarUsuario", new cadastrarUsuarioTarefa());
		// tarefas.put("GET/listarTodos", new listarTodosTarefa());
		// tarefas.put("POST/inserirDadosPlantio",new inserirDadosPlantio());
		// tarefas.put("POST/gerenciarVisualizarContratoServico",new
		// gerenciarVisualizarContratoServico ());
		InserirNovoCliente inc = new InserirNovoCliente();
		tarefas.put("POST/inserirNovoCliente", inc);
		tarefas.put("GET/inserirNovoCliente", inc);
		// tarefas.put("GET/consultarCliente",new consultarCliente ());
		// tarefas.put("GET/gerarRelatorio",new gerarRelatorio ())

	}

	public static Tarefa getTarefa(HttpServletRequest request) {
		Tarefa tarefa = tarefas.get(request.getMethod() + request.getPathInfo());
		if (tarefa != null)
			return tarefa;
		else
			return new NULLTarefa();
	}
}
