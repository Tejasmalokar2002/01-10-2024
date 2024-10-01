package org.example.Creational.Prototype;


public class NetworkConnection implements Cloneable{

    private String ip;
    private String importantData;

    public String getIp(){
        return ip;
    }

    public void setIp(String ip){
        this.ip=ip;
    }

    public String getImportantData(){
        return importantData;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                '}';

    }

    public void loadVeryImportantData() throws InterruptedException {
        this.importantData="Very very important data";
        Thread.sleep(3000);
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
