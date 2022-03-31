package kodlama.io.HRMS.core.utilities;

public class Result {
    private boolean success;
    public String message;

    public Result(boolean success){
        this.success=success;
    }
    public Result(boolean success,String message){
        this.success=success;
        this.message=message;
    }
    public boolean isSuccess(){
        return this.success;
    }
    public String isMessage(){
        return this.message;
    }

}
