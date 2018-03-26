package aula;

	public class PessoaFisica  extends Pessoa{
		private String rg;
		private String cpf;
		
		
		public String getRg() {
			return rg;
		}
		public void setRg(String rg) {
			this.rg = rg;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		PessoaFisica pessoa = new PessoaFisica();
		
		pessoa.setNome("Luis Augusto");
		
		
		System.out.println(pessoa.getNome());
	}
}
