package fridgy.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_NAME = new Prefix("-n");
    public static final Prefix PREFIX_QUANTITY = new Prefix("-q");
    public static final Prefix PREFIX_DESCRIPTION = new Prefix("-d");
    public static final Prefix PREFIX_TAG = new Prefix("-t");
    public static final Prefix PREFIX_EXPIRY = new Prefix("-e");

    /* Recipe Prefixes */
    public static final Prefix PREFIX_INGREDIENT = new Prefix("-i");
    public static final Prefix PREFIX_STEP = new Prefix("-s");

}
