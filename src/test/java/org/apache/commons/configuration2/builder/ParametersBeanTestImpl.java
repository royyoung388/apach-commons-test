/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.configuration2.builder;

/**
 * A test bean used to check whether all properties can be found.
 *
 * @version $Id: ParametersBeanTestImpl.java 1842194 2018-09-27 22:24:23Z ggregory $
 */
public class ParametersBeanTestImpl extends BasicBuilderParameters
{
    private int intProperty;

    private String stringProperty;

    private String fluentGetProperty;

    public int getIntProperty()
    {
        return intProperty;
    }

    public void setIntProperty(final int intProperty)
    {
        this.intProperty = intProperty;
    }

    public String getStringProperty()
    {
        return stringProperty;
    }

    public void setStringProperty(final String stringProperty)
    {
        this.stringProperty = stringProperty;
    }

    public ParametersBeanTestImpl setFluentProperty(final String value)
    {
        setStringProperty(value);
        return this;
    }

    public String getFluentPropertyWithGet()
    {
        return fluentGetProperty;
    }

    public ParametersBeanTestImpl setFluentPropertyWithGet(final String s)
    {
        fluentGetProperty = s;
        return this;
    }
}
