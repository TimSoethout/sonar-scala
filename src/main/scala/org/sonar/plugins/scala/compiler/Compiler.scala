/*
 * Sonar Scala Plugin
 * Copyright (C) 2011 Felix Müller
 * felix.mueller.berlin@googlemail.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.plugins.scala.compiler

import java.io.File
import scala.tools.nsc._
import io.AbstractFile

/**
 * This is a package object that wraps the Scala compiler. It is used to access
 * the compiler from the {@code Lexer} and {@code Parser} in a more convenient way.
 *
 * @author Felix Müller
 * @since 0.1
 */
package object compiler extends Global(new Settings()) {

  // for initialization purpose
  settings.classpath.value += File.pathSeparator + System.getProperty("java.class.path")
  new Run

  override def forScaladoc = true
}