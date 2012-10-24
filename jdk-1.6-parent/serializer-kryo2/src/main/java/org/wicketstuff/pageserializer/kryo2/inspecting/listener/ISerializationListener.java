/**
 * Copyright (C) 2008 Jeremy Thomerson <jeremy@thomersonfamily.com>
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wicketstuff.pageserializer.kryo2.inspecting.listener;

/**
 * serialization listener
 * 
 * @author mosmann
 *
 */
public interface ISerializationListener
{

	/**
	 * called when serialization begins
	 * @param object to be serialized
	 */
	void begin(Object object);

	/**
	 * before an object is written to output, this hook is called
	 * @param position output stream position 
	 * @param object
	 */
	void before(int position, Object object);

	/**
	 * after an object is written to output, this hook is called
	 * if any exception is thrown, then this hook is NOT called
	 * @param position
	 * @param object
	 */
	void after(int position, Object object);

	/**
	 * callend when serialization ends
	 * @param object the object it started with
	 * @param exceptionIfAny if somethings throws an exception, this parameter is set
	 */
	void end(Object object, RuntimeException exceptionIfAny);
}
