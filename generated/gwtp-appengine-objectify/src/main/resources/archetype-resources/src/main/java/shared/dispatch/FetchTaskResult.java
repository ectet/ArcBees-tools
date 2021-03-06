#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.shared.dispatch;

import ${package}.shared.domain.Task;
import com.gwtplatform.dispatch.rpc.shared.Result;

public class FetchTaskResult implements Result {
    private Task task;

    public FetchTaskResult() {
    }

    public FetchTaskResult(Task task) {
        this.task = task;
    }

    public Task getTask() {
        return task;
    }
}
