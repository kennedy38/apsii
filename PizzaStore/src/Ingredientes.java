// Arquivo de apoio: tipos e classes de ingredientes do exemplo do livro.
// Todos os tipos sao package-private; por isso podem ficar juntos aqui.
// Os nomes e os comportamentos sao os mesmos da versao com arquivos separados.

interface Dough {
}

interface Sauce {
}

interface Cheese {
}

interface Veggies {
}

interface Pepperoni {
}

interface Clam {
}

class ThinCrustDough implements Dough {
    public String toString() {
        return "Massa fina";
    }
}

class ThickCrustDough implements Dough {
    public String toString() {
        return "Massa grossa";
    }
}

class MarinaraSauce implements Sauce {
    public String toString() {
        return "Molho Marinara";
    }
}

class PlumTomatoSauce implements Sauce {
    public String toString() {
        return "Molho de tomate";
    }
}

class ReggianoCheese implements Cheese {
    public String toString() {
        return "Queijo parmesao";
    }
}

class MozzarellaCheese implements Cheese {
    public String toString() {
        return "Mussarela";
    }
}

class Garlic implements Veggies {
    public String toString() {
        return "Alho";
    }
}

class Onion implements Veggies {
    public String toString() {
        return "Cebola";
    }
}

class Mushroom implements Veggies {
    public String toString() {
        return "Cogumelo";
    }
}

class RedPepper implements Veggies {
    public String toString() {
        return "Pimentao vermelho";
    }
}

class BlackOlives implements Veggies {
    public String toString() {
        return "Azeitonas pretas";
    }
}

class Spinach implements Veggies {
    public String toString() {
        return "Espinafre";
    }
}

class Eggplant implements Veggies {
    public String toString() {
        return "Berinjela";
    }
}

class SlicedPepperoni implements Pepperoni {
    public String toString() {
        return "Calabresa fatiada";
    }
}

class FreshClam implements Clam {
    public String toString() {
        return "Mariscos frescos";
    }
}

class FrozenClam implements Clam {
    public String toString() {
        return "Mariscos congelados";
    }
}
