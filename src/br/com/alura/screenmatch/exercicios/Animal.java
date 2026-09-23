    package br.com.alura.screenmatch.exercicios;
    public class Animal {
        private String nome;
        private String raca;

        public String getNome() {
            return nome;
        }
        public String getRaca() {
            return raca;
        }

        public Animal(String nome, String raca) {
            this.nome = nome;
            this.raca = raca;
        }

        public void emitirSom(){
            System.out.println("AU au au!");
        }

        @Override
        public String toString() {
        return getNome() + " " + getRaca();
        }
        
    }
