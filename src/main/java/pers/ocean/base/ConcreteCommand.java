package pers.ocean.base;

/**
 * 具体命令角色类
 *
 * @author : ocean_wll
 * @since 2021/6/21
 */
public class ConcreteCommand implements Command {

    /**
     * 持有相应的接收者对象
     */
    private Receiver receiver;

    /**
     * 构造方法
     *
     * @param receiver 接受者对象
     */
    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //通常会转调接收者的方法，让接收者来真正执行功能
        receiver.action();
    }
}
