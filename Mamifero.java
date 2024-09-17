public class Mamifero {
    private String indentificador;
    private String especie;
    private Date fechaNacimiento;
    private Mamifero padre;
    private Mamifero madre;
    
    public String getIdentificador() {
      return this.identificador;
    }
    
    public void setIdentificador(String id) {
      this.identificador = id;
    }
    
    public String getEspecie() {
      return this.especie;
    }
    
    public void setEspecie(String especie) {
      this.especie = especie;
    }
    
    public Date getFechaNacimiento() {
      return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fecha) {
      this.fechaNacimiento = fecha;
    }
    
    public Mamifero getPadre() {
      return this.padre;
    }
    
    public void setPadre(Mamifero padre) {
      this.padre = padre;
    }
    
    public Mamifero getMadre() {
      return this.padre;
    }
    
    public void setMadre(Mamifero madre) {
      this.madre = madre;
    }
    
    public Mamifero getAbueloMaterno() {
      return this.madre.getPadre();
    }
    
    public Mamifero getAbuelaMaterna() {
      return this.madre.getMadre();
    }
    
    public Mamifero getAbueloPaterno() {
      return this.padre.getPadre();
    }
    
    public Mamifero getAbuelaPaterna() {
      return this.padre.getMadre();
    }
    
    public boolean tieneComoAncestroA(Mamifero unMamifero){
      if(this.getIdentificador().equals(unMamifero.getIdentificador())){
        return true;
      }else{
        boolean flag = false;
        flag = this.getPadre().tieneComoAncestroA(unMamifero);
        if(!flag)
          flag = this.getMadre().tieneComoAncestroA(unMamifero);
        return flag;
      }
    }
}


