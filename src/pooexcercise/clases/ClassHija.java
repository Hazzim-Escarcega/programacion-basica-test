package pooexcercise.clases;

public final class ClassHija extends AbstractPadre {
    private String atributoUno;
    private String atributoDos;

    @Override
    protected void metodoPadreUno() {
        super.metodoPadreUno();
    }

    @Override
    protected void metodoPadreDos() {
        super.metodoPadreDos();
    }
        //Para prevenir la instanciacion fuera de este namespace le podemos agregar protected al constructor.
        public ClassHija(String atributoUno, String atributoDos) {
        this.atributoUno = atributoUno;
        this.atributoDos = atributoDos;
    }




    public void metodoHijaUno(){
        System.out.println("Holas soy el metodo hija uno y "+this.atributoUno);
    }
    public void metodoHijaDos(){
        System.out.println("Metodo hija dos y "+this.atributoDos);
    }

}
