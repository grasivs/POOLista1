package exercicios.generation;

public class Cliente {

	public static void main(String[] args) {
		package Entities;

		public class Cliente {
			
			public String nomeCliente;
			public String dataNascimento;
			public String endereco;
			public int telefone;
			public int categoriaInteresse;

			
			public void visualizar() {
				System.out.println("O/a " + nomeCliente + " a sua data de nascimento � " +  dataNascimento + " , vive na " +  endereco + " o seu telefone � " + telefone + " e tem interesse em "+categoriaInteresse);
			}
			
			public int escolha(int categoriaInteresse) 
			{
				if(categoriaInteresse==1)
				{
					System.out.println("O seu interesse � em Acess�rios");
					
				}
				else if(categoriaInteresse==2)
				{
					System.out.println("O seu interesse � em Acess�rios");
					
				}	
			   else if(categoriaInteresse==3)
			   {
				   System.out.println("O seu interesse � em Acess�rios");
					
			   }
				return categoriaInteresse;
				

				
			}
		}

	}

}
