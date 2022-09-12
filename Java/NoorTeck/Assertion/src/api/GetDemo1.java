public class GetDemo1 {

    public static void main(String[] args) {

        String url = "https://us-zipcode.api.smartystreets.com/lookup";
        int expStatusCode = 200;
        String expCity = "Reston";
        String expState = "VIRGINIA";
        String expStateAbrr = "VA";

        Response responsObj;

        responsObj = given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .queryParam("auth-id", "1e22bd92-0434-7170-3919-90284093fdc3")
                .queryParam("auth-token", "tOMaeUn4Y1OHD7zQuGf6")
                .queryParam("city", "reston")
                .queryParam("state", "vA")
                .queryParam("zipcode", "20191")
                .when()
                .get(url)
                .then()
                .extract()
                .response();

        int actStatusCode = responsObj.getStatusCode();
        System.out.println(actStatusCode);
        responsObj.prettyPrint();
    }
}