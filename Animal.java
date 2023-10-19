public class Animal {
    public void som() {
        System.out.println("Voz produzida pelo animal");
    }

    public static class Sapo extends Animal {
        @Override
        public void som() {
            System.out.println("Coaxar");
        }
    }

    public static class Cachorro extends Animal {
        @Override
        public void som() {
            System.out.println("Latir");
        }
    }

    public static class Boi extends Animal {
        @Override
        public void som() {
            System.out.println("Mugir");
        }
    }

    public static class TestaAnimais {
        void Teste() {
            Animal[] animais = new Animal[3];
            animais[0] = new Sapo();
            animais[1] = new Cachorro();
            animais[2] = new Boi();

            for (int i = 0; i < 3; i++) {
                animais[i].som();
            }
        }
    }

    public static void main(String[] args) {
        TestaAnimais teste = new TestaAnimais();
        teste.Teste();
    }
}