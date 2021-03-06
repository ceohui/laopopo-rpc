package org.laopopo.remoting.model;

import org.laopopo.common.exception.remoting.RemotingSendRequestException;
import org.laopopo.common.exception.remoting.RemotingTimeoutException;

import io.netty.channel.ChannelHandlerContext;

/**
 * 
 * @author BazingaLyn
 * @description 处理channel关闭或者inactive的状态的时候的改变
 * @time 2016年8月15日
 * @modifytime
 */
public interface NettyChannelInactiveProcessor {
	
	
	void processChannelInactive(ChannelHandlerContext ctx) throws RemotingSendRequestException, RemotingTimeoutException, InterruptedException;
}
