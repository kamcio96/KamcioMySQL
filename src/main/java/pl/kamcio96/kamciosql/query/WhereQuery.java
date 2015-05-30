package pl.kamcio96.kamciosql.query;

import pl.kamcio96.kamciosql.condition.ConditionBuilder;

public interface WhereQuery<T extends Query> extends Query<T> {

    public T where(ConditionBuilder condition);

}
