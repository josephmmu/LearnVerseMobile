package com.example.learnversemobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.android.material.color.MaterialColors

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SettingFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SettingFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    @OptIn(ExperimentalLayoutApi::class)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_setting, container, false)
        val composeView = view.findViewById<ComposeView>(R.id.compose_view2)

        composeView.setContent {
            grades()
        }
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SettingFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SettingFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    @OptIn(ExperimentalLayoutApi::class)
    @Composable
    fun grades() {

        LazyColumn {
            item {
                val isExpanded1 = remember { mutableStateOf(false) }
                ExpandableHeading(title = "Sy 2022-2023", isExpanded = isExpanded1
                ) {
                    val isNestedExpanded1 = remember {mutableStateOf(false)}
                    ExpandableHeading(
                        title = "Term 1",
                        isExpanded = isNestedExpanded1
                    ) {
                        FlowRow(
                            modifier = Modifier.padding(20.dp,15.dp)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalArrangement = Arrangement.spacedBy(30.dp),
                            maxItemsInEachRow = 3,
                        ) {
                            Text(text = "Courses")
                            Text(text = "Credits")
                            Text(text = "Grade")

                            Text(modifier = Modifier.width(100.dp), text = "College Logic and Math")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "Understanding the Self")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "PE")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "Philippine Pop Culture")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "The Contemporary World")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "Language and Communication")
                            Text(text = "1.00")
                            Text(text = "1.00")
                        }
                    }

                    val isNestedExpanded2 = remember {mutableStateOf(false)}
                    ExpandableHeading(
                        title = "Term 2",
                        isExpanded = isNestedExpanded2
                    ) {
                        FlowRow(
                            modifier = Modifier.padding(20.dp,15.dp)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalArrangement = Arrangement.spacedBy(30.dp),
                            maxItemsInEachRow = 3,
                        ) {
                            Text(text = "Courses")
                            Text(text = "Credits")
                            Text(text = "Grade")

                            Text(modifier = Modifier.width(100.dp), text = "College Logic and Math")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "Understanding the Self")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "PE")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "Philippine Pop Culture")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "The Contemporary World")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "Language and Communication")
                            Text(text = "1.00")
                            Text(text = "1.00")
                        }
                    }

                    val isNestedExpanded3 = remember {mutableStateOf(false)}
                    ExpandableHeading(
                        title = "Term 3",
                        isExpanded = isNestedExpanded3
                    ) {
                        FlowRow(
                            modifier = Modifier.padding(20.dp,15.dp)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalArrangement = Arrangement.spacedBy(30.dp),
                            maxItemsInEachRow = 3,
                        ) {
                            Text(text = "Courses")
                            Text(text = "Credits")
                            Text(text = "Grade")

                            Text(modifier = Modifier.width(100.dp), text = "College Logic and Math")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "Understanding the Self")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "PE")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "Philippine Pop Culture")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "The Contemporary World")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "Language and Communication")
                            Text(text = "1.00")
                            Text(text = "1.00")
                        }
                    }
                }

            }
            item {
                val isExpanded1 = remember { mutableStateOf(false) }
                ExpandableHeading(title = "Sy 2023-2024", isExpanded = isExpanded1
                ) {
                    val isNestedExpanded1 = remember {mutableStateOf(false)}
                    ExpandableHeading(
                        title = "Term 1",
                        isExpanded = isNestedExpanded1
                    ) {
                        FlowRow(
                            modifier = Modifier.padding(20.dp,15.dp)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalArrangement = Arrangement.spacedBy(30.dp),
                            maxItemsInEachRow = 3,
                        ) {
                            Text(text = "Courses")
                            Text(text = "Credits")
                            Text(text = "Grade")

                            Text(modifier = Modifier.width(100.dp), text = "College Logic and Math")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "Understanding the Self")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "PE")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "Philippine Pop Culture")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "The Contemporary World")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "Language and Communication")
                            Text(text = "1.00")
                            Text(text = "1.00")
                        }
                    }

                    val isNestedExpanded2 = remember {mutableStateOf(false)}
                    ExpandableHeading(
                        title = "Term 2",
                        isExpanded = isNestedExpanded2
                    ) {
                        FlowRow(
                            modifier = Modifier.padding(20.dp,15.dp)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalArrangement = Arrangement.spacedBy(30.dp),
                            maxItemsInEachRow = 3,
                        ) {
                            Text(text = "Courses")
                            Text(text = "Credits")
                            Text(text = "Grade")

                            Text(modifier = Modifier.width(100.dp), text = "College Logic and Math")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "Understanding the Self")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "PE")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "Philippine Pop Culture")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "The Contemporary World")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "Language and Communication")
                            Text(text = "1.00")
                            Text(text = "1.00")
                        }
                    }

                    val isNestedExpanded3 = remember {mutableStateOf(false)}
                    ExpandableHeading(
                        title = "Term 3",
                        isExpanded = isNestedExpanded3
                    ) {
                        FlowRow(
                            modifier = Modifier.padding(20.dp,15.dp)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalArrangement = Arrangement.spacedBy(30.dp),
                            maxItemsInEachRow = 3,
                        ) {
                            Text(text = "Courses")
                            Text(text = "Credits")
                            Text(text = "Grade")

                            Text(modifier = Modifier.width(100.dp), text = "College Logic and Math")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "Understanding the Self")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "PE")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "Philippine Pop Culture")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "The Contemporary World")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "Language and Communication")
                            Text(text = "1.00")
                            Text(text = "1.00")
                        }
                    }
                }

            }
            item {
                val isExpanded1 = remember { mutableStateOf(false) }
                ExpandableHeading(title = "Sy 2024-2025", isExpanded = isExpanded1
                ) {
                    val isNestedExpanded1 = remember {mutableStateOf(false)}
                    ExpandableHeading(
                        title = "Term 1",
                        isExpanded = isNestedExpanded1
                    ) {
                        FlowRow(
                            modifier = Modifier.padding(20.dp,15.dp)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalArrangement = Arrangement.spacedBy(30.dp),
                            maxItemsInEachRow = 3,
                        ) {
                            Text(text = "Courses")
                            Text(text = "Credits")
                            Text(text = "Grade")

                            Text(modifier = Modifier.width(100.dp), text = "College Logic and Math")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "Understanding the Self")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "PE")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "Philippine Pop Culture")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "The Contemporary World")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "Language and Communication")
                            Text(text = "1.00")
                            Text(text = "1.00")
                        }
                    }

                    val isNestedExpanded2 = remember {mutableStateOf(false)}
                    ExpandableHeading(
                        title = "Term 2",
                        isExpanded = isNestedExpanded2
                    ) {
                        FlowRow(
                            modifier = Modifier.padding(20.dp,15.dp)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalArrangement = Arrangement.spacedBy(30.dp),
                            maxItemsInEachRow = 3,
                        ) {
                            Text(text = "Courses")
                            Text(text = "Credits")
                            Text(text = "Grade")

                            Text(modifier = Modifier.width(100.dp), text = "College Logic and Math")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "Understanding the Self")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "PE")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "Philippine Pop Culture")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "The Contemporary World")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "Language and Communication")
                            Text(text = "1.00")
                            Text(text = "1.00")
                        }
                    }

                    val isNestedExpanded3 = remember {mutableStateOf(false)}
                    ExpandableHeading(
                        title = "Term 3",
                        isExpanded = isNestedExpanded3
                    ) {
                        FlowRow(
                            modifier = Modifier
                                .padding(20.dp,15.dp)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalArrangement = Arrangement.spacedBy(30.dp),
                            maxItemsInEachRow = 3,

                        ) {
                            Text(text = "Courses")
                            Text(text = "Credits")
                            Text(text = "Grade")

                            Text(modifier = Modifier.width(100.dp), text = "College Logic and Math")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "Understanding the Self")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "PE")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "Philippine Pop Culture")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "The Contemporary World")
                            Text(text = "1.00")
                            Text(text = "1.00")

                            Text(modifier = Modifier.width(100.dp), text = "Language and Communication")
                            Text(text = "1.00")
                            Text(text = "1.00")
                        }
                    }
                }

            }
        }
    }

    @Composable
    fun ExpandableHeading(
        title: String,
        isExpanded: MutableState<Boolean>,
        content: @Composable () -> Unit
    ) {
        val iconResource =
            if (isExpanded.value) R.drawable.baseline_expand_less_24 else R.drawable.baseline_expand_more_24
        val rotationAngle by animateFloatAsState(
            targetValue = if (isExpanded.value) 180f else 0f
        )

        Column {
            Row(
                Modifier
                    .clickable {
                        println("Previous State: $isExpanded")
                        isExpanded.value = !isExpanded.value
                        println("New State: ${isExpanded.value}")
                    }
                    .padding(16.dp)
            ) {
                Text(
                    text = title,
                    modifier = Modifier.weight(1f),
                    fontSize = 17.sp,
                )
                Icon(
                    painter = painterResource(id = iconResource),
                    contentDescription = null,
                    modifier = Modifier.rotate(rotationAngle)
                )
            }

            AnimatedVisibility(visible = isExpanded.value) {
                Column (modifier = Modifier
                    .border(2.dp, Color(240,171,96), shape = RoundedCornerShape(15.dp))
                    .fillMaxWidth()){
                    content()

                }

            }
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}