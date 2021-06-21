package pers.ocean.base;

/**
 * 请求者角色类
 *
 * @author : ocean_wll
 * @since 2021/6/21
 */
public class Invoker {

    /**
     * 持有命令对象
     */
    private Command command;

    /**
     * 构造方法
     *
     * @param command 命令对象
     */
    public Invoker(Command command) {
        this.command = command;
    }

    /**
     * 行动方法
     */
    public void action() {
        command.execute();
    }
}
