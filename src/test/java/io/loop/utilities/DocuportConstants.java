package io.loop.utilities;

public class DocuportConstants {//everything which has the constant name means that it belongs to the final string.
//Public: world can access it
    //Static=se llaman con clase y son una unica copia.
    //final= no pueden ser modificadas. (ya de por si String es inmutable.
    // enum:para declarar variables finales.

    public static final String ERROR_MESSAGE_FOR_EMPTY_PASSWORD = "Please enter your password";
    public static final String LOGO_DOCUPORT = "Docuport";
    public static final String RESET_PASSWORD = "reset-password";
    public static final String RESET_PASSWORD_MESSAGE = "Enter the email address associated with your account";
    public static final String EMAIL_FOR_RESET_PASSWORD = "forgotpasswordg1@gmail.com";
    public static final String CONFIRMATION_MESSAGE = "We've sent you an email with a link to reset your password. Please check your email.";

    public static final String PASSWORD="Group2";
    public static final String USERNAME_CLIENT = "b1g2_client@gmail.com";
    public static final String USERNAME_ADVISOR = "b1g2_advisor@gmail.com";
    public static final String USERNAME_SUPERVISOR = "b1g2_supervisor@gmail.com";
    public static final String USERNAME_EMPLOYEE = "b1g2_employee@gmail.com";

    // roles
    public static final String ADVISOR = "advisor";
    public static final String CLIENT = "client";
    public static final String SUPERVISOR = "supervisor";
    public static final String EMPLOYEE = "employee";

    public static final int extraSmall = 3;
    public static final int small = 5;
    public static final int medium = 7;
    public static final int large = 10;
    public static final int extraLarge = 20;
}
