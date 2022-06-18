package danieljuarezserliogiron_lab9p2;

import javax.swing.JProgressBar;

public class HiloDownload {

    public JProgressBar BarraArchivo;
    public JProgressBar BarraCarpeta;
    public int PesoArchivo;
    public int ArchivosCarpeta;
    public boolean start;

    public HiloDownload() {
    }

    public HiloDownload(JProgressBar BarraArchivo, JProgressBar BarraCarpeta, int PesoArchivo, int ArchivosCarpeta) {
        this.BarraArchivo = BarraArchivo;
        this.BarraCarpeta = BarraCarpeta;
        this.PesoArchivo = PesoArchivo;
        this.ArchivosCarpeta = ArchivosCarpeta;
    }

    public JProgressBar getBarraArchivo() {
        return BarraArchivo;
    }

    public void setBarraArchivo(JProgressBar BarraArchivo) {
        this.BarraArchivo = BarraArchivo;
    }

    public JProgressBar getBarraCarpeta() {
        return BarraCarpeta;
    }

    public void setBarraCarpeta(JProgressBar BarraCarpeta) {
        this.BarraCarpeta = BarraCarpeta;
    }

    public int getPesoArchivo() {
        return PesoArchivo;
    }

    public void setPesoArchivo(int PesoArchivo) {
        this.PesoArchivo = PesoArchivo;
    }

    public int getArchivosCarpeta() {
        return ArchivosCarpeta;
    }

    public void setArchivosCarpeta(int ArchivosCarpeta) {
        this.ArchivosCarpeta = ArchivosCarpeta;
    }
    
    public void run(){
        
    }
    
}

//            try {
//                Thread.sleep(cont*1000);
//            } catch (Exception e) {
//            }
