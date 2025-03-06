public class habilidade {
    private Object nomeHabilidade;
    private Object descricaoHabilidade;
    public habilidade(Object nomeNovo,Object descricaoNova){
        try {
            this.nomeHabilidade = nomeNovo;
            this.descricaoHabilidade = descricaoNova;   
        } catch (Exception e) {
            throw new IllegalArgumentException(e);   
        }
    }
    public Object getNome(){
        return nomeHabilidade;
    }
    public Object getDescricao(){
        return descricaoHabilidade;
    }
}
