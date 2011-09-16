package org.elasticmq.impl

import org.elasticmq.{Client, Node}

class NodeImpl(client: Client, storageShutdown: () => Unit) extends Node {
  def nativeClient = new LoggingClient(client)

  def shutdown() {
    storageShutdown();
  }
}