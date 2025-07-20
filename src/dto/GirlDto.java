package dto;

public class GirlDto {
    private int girlId;
    private String girlName;
    private String debut;
    private String enterName;

    @Override
    public String toString() {
        return "GirlDto{" +
                "girlId=" + girlId +
                ", girlName='" + girlName + '\'' +
                ", debut='" + debut + '\'' +
                ", enterName='" + enterName + '\'' +
                '}';
    }

    public int getGirlId() {
        return girlId;
    }

    public void setGirlId(int girlId) {
        this.girlId = girlId;
    }

    public String getGirlName() {
        return girlName;
    }

    public void setGirlName(String girlName) {
        this.girlName = girlName;
    }

    public String getDebut() {
        return debut;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }


    public String getEnterName() {
        return enterName;
    }

    public void setEnterName(String enterName) {
        this.enterName = enterName;
    }
}
