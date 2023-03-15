/**
 *	create by tools 2016-12-20 15:24:03
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：ITextbookStructure.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.model.resource.iTextbookStructure;

import java.util.List;

public class ITextbookStructure{

	private Integer textbookStructureUid;

	private String textbookStructureName;

	private Integer textbookUid;
	
	private Integer degree;

	private Integer parentUid;

	private Integer textbookStructureChapter;

	private Integer textbookStructureSection;

	public Integer getTextbookStructureUid() {

		return this.textbookStructureUid;
	}

	public void setTextbookStructureUid(Integer textbookStructureUid) {
		this.textbookStructureUid = textbookStructureUid;
	}

	public String getTextbookStructureName() {

		return this.textbookStructureName;
	}

	public void setTextbookStructureName(String textbookStructureName) {
		this.textbookStructureName = textbookStructureName;
	}

	public Integer getTextbookUid() {
		return textbookUid;
	}

	public void setTextbookUid(Integer textbookUid) {
		this.textbookUid = textbookUid;
	}

	public Integer getDegree() {

		return this.degree;
	}

	public void setDegree(Integer degree) {
		this.degree = degree;
	}

	public Integer getParentUid() {

		return this.parentUid;
	}

	public void setParentUid(Integer parentUid) {
		this.parentUid = parentUid;
	}

	public Integer getTextbookStructureChapter() {

		return this.textbookStructureChapter;
	}

	public void setTextbookStructureChapter(Integer textbookStructureChapter) {
		this.textbookStructureChapter = textbookStructureChapter;
	}

	public Integer getTextbookStructureSection() {

		return this.textbookStructureSection;
	}

	public void setTextbookStructureSection(Integer textbookStructureSection) {
		this.textbookStructureSection = textbookStructureSection;
	}

	public List<ITextbookStructure> TextbookStructures;

	public List<ITextbookStructure> getTextbookStructures() {
		return TextbookStructures;
	}

	public void setTextbookStructures(List<ITextbookStructure> textbookStructures) {
		TextbookStructures = textbookStructures;
	}
	
}
