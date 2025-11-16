public class Departement {
    private int id;
    private String nomDep;
    private int nbEmp;

    public Departement(){
        this.id=0;
        this.nomDep="";
        this.nbEmp=0;
    }
    public Departement(int id,String nomDep,int nbEmp){
        this.id=id;
        this.nomDep=nomDep;
        this.nbEmp=nbEmp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setNomDep(String nomDep){
        this.nomDep=nomDep;
    }
    public String getNomDep(){
        return nomDep;
    }

    public void setNbEmp(int nbEmp){
        this.nbEmp=nbEmp;
    }
    public int getNbEmp(){
        return nbEmp;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Departement d = (Departement) obj;
        return this.getId() == d.getId() && this.getNomDep().equals(d.getNomDep());
    }

    public String toString() {
        return "Departement [id ="+id+" nomDepartement="+nomDep+" nbemploye ="+nbEmp+ "]";
    }
}
