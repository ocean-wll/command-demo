package pers.ocean.case2;

import pers.ocean.case1.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : ocean_wll
 * @since 2021/6/21
 */
public class MacroAudioCommand implements MacroCommand {

    private List<Command> commandList = new ArrayList<>();

    /**
     * 执行方法
     */
    @Override
    public void execute() {
        System.out.println("---自动回放保存的命令---");
        for (Command command : commandList) {
            command.execute();
        }
        System.out.println("---宏命令集回放完成---");
    }

    /**
     * 宏命令集管理方法
     */
    @Override
    public void add(Command command) {
        commandList.add(command);
    }

    /**
     * 宏命令集管理方法
     */
    @Override
    public void remove(Command command) {
        commandList.remove(command);
    }
}