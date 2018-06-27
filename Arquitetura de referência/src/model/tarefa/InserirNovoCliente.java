package model.tarefa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.ClienteDAO;
import model.javabean.Cliente;

public class InserirNovoCliente implements Tarefa {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if (request.getMethod().equals("GET"))
			return "index2";
		else {
			Cliente c = new Cliente(request.getParameter("cpfCliente"),request.getParameter("cliente"),request.getParameter("fazenda"));
			new ClienteDAO().salvar(c);
			return "index";
		}
	}

}
