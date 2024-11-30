package com.entity.view;
import com.entity.StoreupEntity;
import com.entity.guabzhuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
public class guabzhuView  extends StoreupEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    public guabzhuView(){
    }

    public guabzhuView(StoreupEntity guabzhuEntity){
        try {
            BeanUtils.copyProperties(this, guabzhuEntity);
        } catch (IllegalAccessException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
