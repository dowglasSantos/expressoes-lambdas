package generic;

import java.util.List;

public interface GenericResult<T> {
    void getValue(List<T> values);
}
