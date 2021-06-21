package pers.ocean.case1;

import pers.ocean.case1.command.PlayCommand;
import pers.ocean.case1.command.RewindCommand;
import pers.ocean.case1.command.StopCommand;

/**
 * 客户端类，由茱莉小女孩扮演
 *
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
        //创建请求者对象
        Keypad keypad = new Keypad();
        keypad.setPlayCommand(playCommand);
        keypad.setRewindCommand(rewindCommand);
        keypad.setStopCommand(stopCommand);
        //测试
        keypad.play();
        keypad.rewind();
        keypad.stop();
        keypad.play();
        keypad.stop();
    }
}
