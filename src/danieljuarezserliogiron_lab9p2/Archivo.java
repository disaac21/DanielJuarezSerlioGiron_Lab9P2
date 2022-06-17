package danieljuarezserliogiron_lab9p2;

public class Archivo {
    
    //Tendrán un nombre, un link, una extensión (pdf, txt, docx, jpg, mp4) y tamaño.
    
    public String Nombre;
    public String Link;
    public String Extension;
    public int Tamano;

    public Archivo() {
    }

    public Archivo(String Nombre, String Link, String Extension, int Tamano) {
        this.Nombre = Nombre;
        this.Link = Link;
        this.Extension = Extension;
        this.Tamano = Tamano;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String Link) {
        this.Link = Link;
    }

    public String getExtension() {
        return Extension;
    }

    public void setExtension(String Extension) {
        this.Extension = Extension;
    }

    public int getTamano() {
        return Tamano;
    }

    public void setTamano(int Tamano) {
        this.Tamano = Tamano;
    }

    @Override
    public String toString() {
        return "Archivo{" + "Nombre=" + Nombre + "." + Extension + '}';
    }
    
    
    
}
