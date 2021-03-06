/**
 * Copyright 1996-2014 FoxBPM ORG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * @author MAENLIANG
 */
package org.foxbpm.engine.impl.diagramview.svg.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.foxbpm.engine.impl.diagramview.vo.VONode;

/**
 * SVG对象，映射SVG文件模型
 * 
 * @author MAENLIANG
 * @date 2014-06-10
 * 
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "svg")
public class SvgVO extends VONode {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1316043116432334296L;
	@XmlAttribute(name = "xmlns")
	private String xmlns = "http://www.w3.org/2000/svg";
	@XmlAttribute(name = "xmlns:svg")
	// private String xmlnsSvg = "http://www.w3.org/2000/svg";
	// @XmlAttribute(name = "xmlns:oryx")
	private String xmlnsOryx = "http://www.b3mn.org/oryx";
	@XmlAttribute(name = "xmlns:xlink")
	private String xmlnsXlink = "http://www.w3.org/1999/xlink";

	@XmlAttribute(name = "version")
	private String version;
	@XmlAttribute(name = "edge", namespace = "http://www.b3mn.org/oryx")
	private String oryxEdge;
	@XmlElement(name = "defs")
	private DefsVO defsVo;
	@XmlElement(name = "magnets", namespace = "http://www.b3mn.org/oryx")
	private OryxMagnetsVO oryxMagnetsVo;
	@XmlElement(name = "docker", namespace = "http://www.b3mn.org/oryx")
	private OryxDockerVO oryxDockerVO;
	@XmlElement(name = "g")
	private GVO gVo;

	@XmlAttribute(name = "minwidth")
	private String minWidth;
	@XmlAttribute(name = "minheight")
	private String minHeight;

	public String getXmlns() {
		return xmlns;
	}

	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}

	public String getXmlnsOryx() {
		return xmlnsOryx;
	}

	public void setXmlnsOryx(String xmlnsOryx) {
		this.xmlnsOryx = xmlnsOryx;
	}

	public String getXmlnsXlink() {
		return xmlnsXlink;
	}

	public void setXmlnsXlink(String xmlnsXlink) {
		this.xmlnsXlink = xmlnsXlink;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public DefsVO getDefsVo() {
		return defsVo;
	}

	public void setDefsVo(DefsVO defsVo) {
		this.defsVo = defsVo;
	}

	public OryxMagnetsVO getOryxMagnetsVo() {
		return oryxMagnetsVo;
	}

	public void setOryxMagnetsVo(OryxMagnetsVO oryxMagnetsVo) {
		this.oryxMagnetsVo = oryxMagnetsVo;
	}

	public GVO getgVo() {
		return gVo;
	}

	public void setgVo(GVO gVo) {
		this.gVo = gVo;
	}

	public String getOryxEdge() {
		return oryxEdge;
	}

	public void setOryxEdge(String oryxEdge) {
		this.oryxEdge = oryxEdge;
	}

	public OryxDockerVO getOryxDockerVO() {
		return oryxDockerVO;
	}

	public void setOryxDockerVO(OryxDockerVO oryxDockerVO) {
		this.oryxDockerVO = oryxDockerVO;
	}

	public String getMinWidth() {
		return minWidth;
	}

	public void setMinWidth(String minWidth) {
		this.minWidth = minWidth;
	}

	public String getMinHeight() {
		return minHeight;
	}

	public void setMinHeight(String minHeight) {
		this.minHeight = minHeight;
	}

}
