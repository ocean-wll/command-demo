package pers.ocean.case2;

import pers.ocean.case1.Command;

/**
 * @author : ocean_wll
 * @since 2021/6/21
 */
public interface MacroCommand extends Command {

    /**
     * 宏命令集的管理方法
     * 可以添加一个成员命令
     *
     * @param command 命令
     */
    void add(Command command);

    /**
     * 宏命令集的管理方法
     * 可以移除一个成员命令
     *
     * @param command 命令
     */
    void remove(Command command);
}