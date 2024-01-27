package poc.example.wishlist_module.entity;

public class RestError {
	
	private String httpmessage;
    private String message;

    public RestError(String httpmessage, String message) {
        this.httpmessage = httpmessage;
        this.message = message;
    }

    public RestError() {
    }

    public String getHttpmessage() {
        return httpmessage;
    }

    public void setHttpmessage(String httpmessage) {
        this.httpmessage = httpmessage;
    }

    public String getMessage() {
        return message;
    }

}
