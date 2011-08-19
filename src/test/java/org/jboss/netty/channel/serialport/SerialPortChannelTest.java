/*
 * Copyright 2011 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package org.jboss.netty.channel.serialport;

import java.io.IOException;
import org.jboss.netty.channel.SimpleChannelHandler;
import java.util.Arrays;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.DefaultChannelPipeline;
import org.jboss.netty.channel.MessageEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author David Hoyt
 */
public class SerialPortChannelTest {
	//<editor-fold defaultstate="collapsed" desc="Init">
	@BeforeClass
	public static void setUpClass() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}
	//</editor-fold>

	//<editor-fold defaultstate="collapsed" desc="Misc Classes">
	private static class LoggingChannelPipeline implements ChannelPipelineFactory {
		@Override
		public ChannelPipeline getPipeline() throws Exception {
			DefaultChannelPipeline pipeline = new DefaultChannelPipeline();
			pipeline.addLast("loggingHandler", new SimpleChannelHandler() {
				@Override
				public void messageReceived(final ChannelHandlerContext ctx, final MessageEvent e)
						throws Exception {
					System.out.println(Arrays.toString(((ChannelBuffer) e.getMessage()).array()));
					super.messageReceived(ctx, e);
				}
			});
			return pipeline;
		}
	}
	//</editor-fold>
	
	@Test
	public void checkCommPorts() {
//		CommPortIdentifier cpi;
//		Enumeration en = CommPortIdentifier.getPortIdentifiers();
//		while(en.hasMoreElements()) {
//			 cpi = (CommPortIdentifier)en.nextElement();
//			 if (cpi == null)
//				 continue;
//			 assertNotNull(cpi);
//			 assertFalse("".equalsIgnoreCase(cpi.getName()));
//			 
//			 System.out.println(cpi.getName());
//			 System.out.println("owned: " + cpi.isCurrentlyOwned() + (cpi.isCurrentlyOwned() ? ", owner: " + cpi.getCurrentOwner() : ""));
//		}
	}
	@Test
	public void openSerialPort() throws InterruptedException, IOException {
//		ClientBootstrap bootstrap = new ClientBootstrap(new SerialPortChannelFactory(Executors.newCachedThreadPool()));
//		assertNotNull(bootstrap);
//		
//		//ChannelPipelineFactory factory = new ChannelPipelineFactory(
//		bootstrap.setPipelineFactory(new LoggingChannelPipeline());
//		Channel channel = bootstrap.connect(new SerialPortDeviceAddress("COM2")).awaitUninterruptibly().getChannel();
//		Thread.sleep(30000);
//		channel.close().awaitUninterruptibly();
//		bootstrap.releaseExternalResources();
//		System.in.read();
	}
}
