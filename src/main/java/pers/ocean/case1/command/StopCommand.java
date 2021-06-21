package pers.ocean.case1.command;

import pers.ocean.case1.AudioPlayer;
import pers.ocean.case1.Command;

/**
 * @author : ocean_wll
 * @since 2021/6/21
 */
public class StopCommand implements Command {

    private AudioPlayer audio;

    public StopCommand(AudioPlayer audio) {
        this.audio = audio;
    }

    /**
     * 执行方法
     */
    @Override
    public void execute() {
        audio.stop();
    }
}
