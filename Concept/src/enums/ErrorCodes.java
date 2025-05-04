package enums;

/**
 * @author avinash.a.mishra
 */
enum ErrorCodes {

    SERVER_ERROR("serverError", 500),

    NOT_FOUND("not found", 404);

    private String message;
    private Integer code;

    private ErrorCodes(String message, Integer code){
        this.message=message;
        this.code=code;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
