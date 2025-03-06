public class ficha {
    private String nome;
    private String classe;

    private int hpMax;
    private int hpAtual;
    private int manaMax;
    private int manaAtual;

    private int level;
    private int xp;
    private int forca;
    private int destreza;
    private int resistencia;
    private int inteligencia;
    private int sabedoria;
    private int carisma;
    private boolean rage = false;
    private boolean vivo = true;
    private listaHabilidade minhasHabilidades = new listaHabilidade();
    private listaLog logPersonagem = new listaLog();
    // private listaItens bolsa = new listaItens();
    // private listaProficiencias proficiencia = new listaProficiencia();

    public ficha(
            String nome, int level, int xp, int forca, int destreza, int resistencia, int inteligencia, int sabedoria,
            int carisma, String classe, int hp, int manaMax) {

        this.nome = nome;
        this.level = level;
        this.xp = xp;
        this.forca = forca;
        this.destreza = destreza;
        this.resistencia = resistencia;
        this.inteligencia = inteligencia;
        this.sabedoria = sabedoria;
        this.carisma = carisma;
        this.classe = classe;
        this.manaMax = manaMax;
        this.manaAtual = manaMax;
        this.hpMax = hp;
        this.hpAtual = hp;

    }

    public void tomouDano(int dano) {
        if (this.hpAtual - dano <= 0) {
            System.out.println(this.nome + " morreu");
            vivo = false;
        } else {
            this.hpAtual -= dano;
        }
    }

    public void regenerarVida(int heal) {
        if (this.hpAtual + heal > hpMax) {
            hpAtual = hpMax;
        } else {
            hpAtual += heal;
        }
    }

    public int getMana() {
        return manaAtual;
    }

    public void regeneraMana(int mana) {

        if (this.manaAtual + mana > this.manaMax) {
            manaAtual = manaMax;
        }
        // considerando que podemos drenar a mana do inimigo
        else if (manaAtual + mana > 0) {
            this.manaAtual += mana;
        } else if (this.manaAtual + mana < 0) {
            this.manaAtual = 0;
        }
    }

    public boolean estaVivo() {
        return vivo;
    }

    public void novoLog(Object autor, Object receptor, Object acao, Object log) {

        this.logPersonagem.adiciona(log, log, log, acao, receptor);

    }
}