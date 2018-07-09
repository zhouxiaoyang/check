package com.checkpoint.check.util;

import com.checkpoint.check.dataVo.ResultVo;
import com.checkpoint.check.enums.ResultEnum;

/**
 * @Description: 结果集util
 * @Author: Winston Yang
 * @Date: Create in 10:18 2018/4/26
 * @Modified by:
 */
public class ResultVoUtil {

    public static ResultVo success(){
        return  success(null);
    }
    /**
     * 成功
     */
    public static ResultVo success(Object data){
        ResultVo resultVo=new ResultVo();
        resultVo.setMsg(ResultEnum.SUCCESS.getMsg());
        resultVo.setCode(ResultEnum.SUCCESS.getCode());
        resultVo.setData(data);
        return resultVo;
    }

    public static ResultVo fail(){
        ResultVo resultVo=new ResultVo();
        resultVo.setMsg(ResultEnum.FAIL.getMsg());
        resultVo.setCode(ResultEnum.FAIL.getCode());
        return resultVo;
    }

    public static ResultVo other(){
        ResultVo resultVo=new ResultVo();
        resultVo.setMsg(ResultEnum.OTHER.getMsg());
        resultVo.setCode(ResultEnum.OTHER.getCode());
        return resultVo;
    }
}
