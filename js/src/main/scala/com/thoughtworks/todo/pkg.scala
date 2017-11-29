package com.thoughtworks.todo

import com.thoughtworks.binding.Binding
import org.scalajs.dom.raw.Node

package object xxx {
//  implicit def makeIntellijHappy[T<:org.scalajs.dom.raw.Node](x: scala.xml.Node): Binding[T] =
  implicit def makeIntellijHappy(x: scala.xml.Elem): Binding[Node] = throw new AssertionError("This should never execute.")
}
