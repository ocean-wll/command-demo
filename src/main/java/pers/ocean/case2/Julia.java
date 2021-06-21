package pers.ocean.case2;

import pers.ocean.case1.AudioPlayer;
import pers.ocean.case1.Command;
import pers.ocean.case1.command.PlayCommand;
import pers.ocean.case1.command.RewindCommand;
import pers.ocean.case1.command.StopCommand;

/**
 * @author : ocean_wll
 * @since 2021/6/21
 */
public class Julia {

    public static void main(String[] args) {
        //创建接收者对象
        AudioPlayer audioPlayer = new AudioPlayer();
        //创建命令对象
        Command playCommand = new PlayCommand(audioPlayer);
        Command rewindCommand = new RewindCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);

        //创建宏命令对象
        MacroCommand macroCommand = new MacroAudioCommand();
        //记录操作命令
        macroCommand.add(playCommand);
        macroCommand.add(rewindCommand);
        macroCommand.add(stopCommand);
        macroCommand.add(playCommand);
        macroCommand.add(stopCommand);
        //执行宏命令
        macroCommand.execute();
    }
}
