package com.StringPractice;

public class EliminateSpecialCharacters {
    public static void main(String[] args) {
        String name = "T^&^H*O&^^R";

       String alter =  name.replaceAll("[^A-Z]","");
        System.out.println(alter);
        System.out.println("****************************");
        String url = "https://accounts.google.com/o/oauth2/v2/auth/" +
                "oauthchooseaccount?state=EgVvYXV0aCLMBQoUdk8xS2Jsazd4WDl0VW4yY3BaTFMSCWF1dGhvcml6ZRo1aHR0c" +
                "HM6Ly9zZWN1cmUuYm9va2luZy5jb20vbG9naW4uaHRtbD" +
                "9vcD1vYXV0aF9yZXR1cm4q6wRVczBEeTEzTDBlOE5qUEt3Y1d2LVpFbU81d0RkRnpIS0Jk" +
                "bkl3emFlVnVuc3hBYlBZVkNpMXZGUVZyOHFlZWtfaFlibkdzN2lhcGwwNUMzNmJQTGwwdS1nLVlmSUZ4OXdiNWln" +
                "WThXbnhJbVRINjJtUHBjQmtuZ0VhazlPVHM0cWdJd0V3RHZsVTI4SE10eVNIV18xeTNZM0Jma0pKa2pmT3pGVHNLO" +
                "GZsSFVyZkd3UUdkNHd2aXNlNGdlSHU5a1VRV056X0lONTE2bk1PeHpCZzZKZTZpQ2xiQ1dLZnFFcDJaTDJjek1tQUhvR" +
                "kF6SDNOdTgzOW9kZ3RuWlAzODJCOHVMX1ZrRW5Hcmw3ZEZjTHBCRFlaclFtSTl5ZFkzbXJJcUZXek4zLW5KN2NWa2QzTHB5Ul" +
                "haUE9KSGpHNmpEX2RiVHdRSmtBOHhHRTN4SzVNLU5sVG0tRkttZVFHaFJ1dVE0RFItQV81U2QtTXhGcGhJUms4RFJwcEFualpDV" +
                "jNybkJTd0pnQUtFR2VnbkpyYkk0NHdTZmZ3ZlNpdEx6QS02OHpIY3JZWFo2ZFJ2QW40My1oblBUbWlMSndCRmdQTW01TDBtaTU2" +
                "UFFLMWVYbE1SS1FSXzVqcG9PTkNSOXV3U1RBdk1hRW5wVWhZNTFlazBocjNvSWhjN1J6NmJfXzlqN1hha1hEQnZjNGk5VXlSb2Q" +
                "1QkZ2MG1BcXpxVng3NWhCMTdlQXQ2X3ZySEpvOGVhZjBqMzZDYUdlVHM5UlV5SldHakl3dkpaRkxNM1BqRnBmcDczekl5X1hZbj" +
                "UwaFdUOU5XMDJWaVV3QgRjb2RlKhcIxIiNATCJz8Ca5akmOgBCAFiGl-GjBg&scope=email%20profile&redirect_uri=htt" +
                "ps%3A%2F%2Faccount.booking.com%2Fsocial%2Fresult%2Fgoogle&access_type=online&response_type=code&cli" +
                "ent_id=901905703382-m88jn1h9ll89odkt6t5muc6h7ep83rlh.apps.googleusercontent.com&service=lso&o2v=2&f" +
                "lowName=GeneralOAuthFlow";

       String firstPart = url.split("code&client_id=")[1];
        System.out.println(firstPart);
       String secondPart = firstPart.split("-m88jn1")[0];
        System.out.println(secondPart);
        Long num = Long.parseLong(secondPart);
        System.out.println(num);

    }
}
