package Classes_;

public class ObjetoCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();

		//OBJETO 1
		cliente1.setNome("Nome: Lucas");
		cliente1.setTelefone("Telefoe: (15)112345678");
		cliente1.setCPF("CPF: 123456789-00");
		cliente1.setRg("Rg: 123.456.789.");
		cliente1.setIdade("Idade:21 anos");
		cliente1.setEndereco(" Endereço: Itapetininga sp");
		cliente1.setRenda(" Renda: R$ 5.000 mensal");
		cliente1.setEmail("Email: lucas@gmail.com");
		cliente1.setSexo("Sexo: Masculino");
		
		//OBJETO 2
				cliente2.setNome("Nome: Henrique");
				cliente2.setTelefone("Telefoe: (15)11687678");
				cliente2.setCPF("CPF: 123456789-00");
				cliente2.setRg("Rg: 123.456.789.");
				cliente2.setIdade("Idade:18 anos");
				cliente2.setEndereco(" Endereço: São paulo");
				cliente2.setRenda(" Renda: R$ 100 mensal");
				cliente2.setEmail("Email: henrqque@yahoo.com.br");
				cliente2.setSexo("Sexo: masculino");
		

		//CHAMANDO O METÓDO GET(PARA APRESENTAR OS OBJETOS 
		System.out.println("-------Cliente-1-------");
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCPF());
		System.out.println(cliente1.getRg());
		System.out.println(cliente1.getIdade());
		System.out.println(cliente1.getEndereco());
		System.out.println(cliente1.getRenda());
		System.out.println(cliente1.getEmail());
		System.out.println(cliente1.getSexo());

		
		System.out.println("-------Cliente-2-------");
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getTelefone());
		System.out.println(cliente2.getCPF());
		System.out.println(cliente2.getRg());
		System.out.println(cliente2.getIdade());
		System.out.println(cliente2.getEndereco());
		System.out.println(cliente2.getRenda());
		System.out.println(cliente2.getEmail());
		System.out.println(cliente2.getSexo());

		
	

}

}
