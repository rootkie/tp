package fridgy.logic.commands;

import static fridgy.logic.commands.CommandTestUtil.assertCommandSuccess;

import fridgy.model.Model;
import org.junit.jupiter.api.Test;

import fridgy.model.ModelManager;

public class HelpCommandTest {
    private Model model = new ModelManager();
    private Model expectedModel = new ModelManager();

    @Test
    public void execute_help_success() {
        CommandResult expectedCommandResult = new CommandResult(HelpCommand.SHOWING_HELP_MESSAGE, true, false);
        CommandTestUtil.assertCommandSuccess(new HelpCommand(), model, expectedCommandResult, expectedModel);
    }
}
